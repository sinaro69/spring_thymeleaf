package com.istad.springthymleafpartone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

@SpringBootApplication
public class SpringThymleafPartoneApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(SpringThymleafPartoneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale currentlocale = LocaleContextHolder.getLocale();
        String countyName = currentlocale.getDisplayCountry();
        System.out.println("Country name is :"+countyName);

        String languageCode = currentlocale.getLanguage();
        System.out.println("Language Code is"+languageCode);


        // write code to show all the language code
        String[] language = Locale.getISOLanguages();
        for (String lang: language
             ) {
            Locale locale = new Locale(lang);
            System.out.println(locale.getLanguage()+"->"+locale.getDisplayLanguage());
        }



    }
}

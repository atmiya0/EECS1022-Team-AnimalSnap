package com.example.animalsnaperoni;

import android.util.Log;

import java.util.LinkedList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class AnimalDatabase {

    // Created a Animals LinkedList - Makes life simple
    private static LinkedList<Animal> animals = new LinkedList<>();
    static LinkedList<Animal> photoOfTheDay = new LinkedList<>();


    // Populating with the Animal Data
    public static void init() {

        animals.add(new Animal(
                R.drawable.germanshepard,
                "German Shepherd",
                "The German Shepherd is a German breed of working dog of medium to large size." +
                        " It is a modern breed, developed by Max von Stephanitz from various traditional German herding dogs from 1899." +
                        " It was originally bred as a herding dog, for herding sheep.",
                "Dog",
                "Germany",
                10000000
        ));
        animals.add(new Animal(
                R.drawable.bulldog,
                "Bull Dog",
                "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. " +
                        "It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. " +
                        "The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records.",
                "Dog",
                "England",
                50000000
        ));
        animals.add(new Animal(
                R.drawable.britishshorthair,
                "British Shorthair",
                "The British Shorthair is the pedigreed version of the traditional British domestic cat, with a distinctively stocky body, " +
                        "dense coat, and broad face. The most familiar colour variant is the \"British Blue\", with a solid grey-blue coat, orange eyes, " +
                        "and a medium-sized tail.",
                "Cat",
                "United Kingdom",
                200000
        ));
        animals.add(new Animal(
                R.drawable.bengalcat,
                "Bengal cat",
                "The Bengal cat is a domesticated cat breed created from hybrids of domestic cats, especially the spotted Egyptian Mau, with " +
                        "the Asian leopard cat. The breed name comes from the leopard cat's taxonomic name.",
                "Cat",
                "USA",
                120000
        ));
        animals.add(new Animal(
                R.drawable.europeanrabbit,
                "European rabbit",
                "The European rabbit or coney is a species of rabbit native to the Iberian Peninsula, western France, and the northern Atlas " +
                        "mountains in Northwest Africa. It has been widely introduced elsewhere, often with devastating effects on local biodiversity.",
                "Rabbit",
                "France",
                14000000
        ));
        animals.add(new Animal(
                R.drawable.netherlanddwarfrabbit,
                "Netherland Dwarf rabbit",
                "The Netherland Dwarf is a breed of domestic rabbit that originated in the Netherlands. Weighing 1.1–2.5 pounds, " +
                        "the Netherland Dwarf is one of the smallest rabbit breeds. Its popularity as a pet or show rabbit may stem from its " +
                        "neotenic appearance.",
                "Rabbit",
                "Netherlands",
                14000000
        ));
        animals.add(new Animal(
                R.drawable.macaws,
                "Macaws",
                "The Netherland Dwarf is a breed of domestic rabbit that originated in the Netherlands. Weighing 1.1–2.5 pounds, " +
                        "the Netherland Dwarf is one of the smallest rabbit breeds. Its popularity as a pet or show rabbit may stem from its " +
                        "neotenic appearance.",
                "Parrot",
                "Central America",
                50000
        ));
        animals.add(new Animal(
                R.drawable.cockatoos,
                "Cockatoos",
                "A cockatoo is any of the 21 parrot species belonging to the family Cacatuidae, the only family in the superfamily " +
                        "Cacatuoidea. Along with the Psittacoidea and the Strigopoidea, they make up the order Psittaciformes.",
                "Parrot",
                "Oceania",
                10000
        ));
        animals.add(new Animal(
                R.drawable.sakhalinfox,
                "Sakhalin fox",
                "The Ezo red fox is a subspecies of red fox widely distributed in Hokkaido, Sakhalin, the Kuril Islands and the surrounding " +
                        "islands of Japan. The Ezo red fox's formal name, Kitakitsune, was given to the subspecies by Kyukichi Kishida when he studied " +
                        "them in Sakhalin in 1924.",
                "Fox",
                "Japan",
                20000
        ));
        animals.add(new Animal(
                R.drawable.eurasiantreesparrow,
                "Eurasian tree sparrow",
                "The Eurasian tree sparrow is a passerine bird in the sparrow family with a rich chestnut crown and nape, and a black patch on " +
                        "each pure white cheek. The sexes are similarly plumaged, and young birds are a duller version of the adult.",
                "Sparrow",
                "Illinois",
                20000
        ));


        //    code that executes every 24 hours, for the new photo new day
        Timer timer = new Timer ();
        TimerTask t = new TimerTask() {
            @Override
            public void run () {
                Log.d("func check", "running run");

                //instance of random class used to get random photo in database
                Random rand = new Random();
                int int_random = rand.nextInt(getData().size());
                int count = 0;
                for (Animal a : animals) {
                    if(count == int_random) {
                        photoOfTheDay.add(a);
                        break;
                    }
                    count++;
                }

            }
        };
        timer.schedule(t, 0l, 1000*60*60*24); 
    }

    // Method to get the Animals Data
    public static LinkedList<Animal> getData() {
        return animals;
    }

    public static LinkedList<Animal> getPhotoOfTheDay() {
        return photoOfTheDay;
    }


}

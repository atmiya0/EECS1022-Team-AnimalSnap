package com.example.animalsnaperoni;

import java.util.LinkedList;

public class AnimalTemp {
    private static LinkedList<Animal> animals = new LinkedList<>();

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
                R.drawable.macaws,
                "Macaws",
                "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. " +
                        "It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. " +
                        "The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records.",
                "Dog",
                "England",
                50000000
        ));
    }

    public static LinkedList<Animal> getData() {
        return animals;
    }

    public AnimalTemp() {
        String[] names = {"German Shepherd", "Bull Dog", "British Shorthair", "Bengal cat", "European rabbit", "Macaws", "Cockatoos", "Netherland Dwarf rabbit", "Sakhalin fox", "Eurasian tree sparrow"};
        String[] descriptions = new String[10];
        String[] species = {"Dog", "Dog", "Cat", "Cat", "Rabbit", "Rabbit", "Parrot", "Parrot", "Fox", "Sparrow"};
        String[] origin = {"Germany", "England", "United Kingdom", "USA", "France", "Netherlands", "Central America", "Oceania", "Japan"};
        int[] population = {10000000, 50000000, 200000, 120000, 14000000, 50000, 10000, 20000};

        descriptions[0] = "\n" +
                "The German Shepherd is a German breed of working dog of medium to large size. It is a modern breed, developed by Max von Stephanitz from various traditional German herding dogs from 1899. It was originally bred as a herding dog, for herding sheep.";
        descriptions[1] = "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records.";
        descriptions[2] = "The British Shorthair is the pedigreed version of the traditional British domestic cat, with a distinctively stocky body, dense coat, and broad face. The most familiar colour variant is the \"British Blue\", with a solid grey-blue coat, orange eyes, and a medium-sized tail.";
        descriptions[3] = "\n" +
                "The Bengal cat is a domesticated cat breed created from hybrids of domestic cats, especially the spotted Egyptian Mau, with the Asian leopard cat. The breed name comes from the leopard cat's taxonomic name.";
        descriptions[4] = "The European rabbit or coney is a species of rabbit native to the Iberian Peninsula, western France, and the northern Atlas mountains in Northwest Africa. It has been widely introduced elsewhere, often with devastating effects on local biodiversity.";
        descriptions[5] = "The Netherland Dwarf is a breed of domestic rabbit that originated in the Netherlands. Weighing 1.1–2.5 pounds, the Netherland Dwarf is one of the smallest rabbit breeds. Its popularity as a pet or show rabbit may stem from its neotenic appearance.";
        descriptions[6] = "Macaws are a group of New World parrots that are long-tailed and often colorful. They are popular in aviculture or as companion parrots, although there are conservation concerns about several species in the wild.";
        descriptions[7] = "A cockatoo is any of the 21 parrot species belonging to the family Cacatuidae, the only family in the superfamily Cacatuoidea. Along with the Psittacoidea and the Strigopoidea, they make up the order Psittaciformes.";
        descriptions[8] = "The Ezo red fox is a subspecies of red fox widely distributed in Hokkaido, Sakhalin, the Kuril Islands and the surrounding islands of Japan. The Ezo red fox's formal name, Kitakitsune, was given to the subspecies by Kyukichi Kishida when he studied them in Sakhalin in 1924.";
        descriptions[9] = "The Eurasian tree sparrow is a passerine bird in the sparrow family with a rich chestnut crown and nape, and a black patch on each pure white cheek. The sexes are similarly plumaged, and young birds are a duller version of the adult.";
    }


    public static void main(String[] args) {

        String[] names = {"German Shepherd", "Bull Dog", "British Shorthair", "Bengal cat", "European rabbit", "Macaws", "Cockatoos", "Netherland Dwarf rabbit", "Sakhalin fox", "Eurasian tree sparrow"};
        String[] descriptions = new String[10];
        String[] species = {"Dog", "Dog", "Cat", "Cat", "Rabbit", "Rabbit", "Parrot", "Parrot", "Fox", "Sparrow"};
        String[] origin = {"Germany", "England", "United Kingdom", "USA", "France", "Netherlands", "Central America", "Oceania", "Japan"};
        int[] population = {10000000, 50000000, 200000, 120000, 14000000, 50000, 10000, 20000};

        descriptions[0] = "\n" +
                "The German Shepherd is a German breed of working dog of medium to large size. It is a modern breed, developed by Max von Stephanitz from various traditional German herding dogs from 1899. It was originally bred as a herding dog, for herding sheep.";
        descriptions[1] = "The Bulldog, also known as the English Bulldog or British Bulldog, is a medium-sized dog breed. It is a muscular, hefty dog with a wrinkled face and a distinctive pushed-in nose. The Kennel Club, the American Kennel Club, and the United Kennel Club oversee breeding records.";
        descriptions[2] = "The British Shorthair is the pedigreed version of the traditional British domestic cat, with a distinctively stocky body, dense coat, and broad face. The most familiar colour variant is the \"British Blue\", with a solid grey-blue coat, orange eyes, and a medium-sized tail.";
        descriptions[3] = "\n" +
                "The Bengal cat is a domesticated cat breed created from hybrids of domestic cats, especially the spotted Egyptian Mau, with the Asian leopard cat. The breed name comes from the leopard cat's taxonomic name.";
        descriptions[4] = "The European rabbit or coney is a species of rabbit native to the Iberian Peninsula, western France, and the northern Atlas mountains in Northwest Africa. It has been widely introduced elsewhere, often with devastating effects on local biodiversity.";
        descriptions[5] = "The Netherland Dwarf is a breed of domestic rabbit that originated in the Netherlands. Weighing 1.1–2.5 pounds, the Netherland Dwarf is one of the smallest rabbit breeds. Its popularity as a pet or show rabbit may stem from its neotenic appearance.";
        descriptions[6] = "Macaws are a group of New World parrots that are long-tailed and often colorful. They are popular in aviculture or as companion parrots, although there are conservation concerns about several species in the wild.";
        descriptions[7] = "A cockatoo is any of the 21 parrot species belonging to the family Cacatuidae, the only family in the superfamily Cacatuoidea. Along with the Psittacoidea and the Strigopoidea, they make up the order Psittaciformes.";
        descriptions[8] = "The Ezo red fox is a subspecies of red fox widely distributed in Hokkaido, Sakhalin, the Kuril Islands and the surrounding islands of Japan. The Ezo red fox's formal name, Kitakitsune, was given to the subspecies by Kyukichi Kishida when he studied them in Sakhalin in 1924.";
        descriptions[9] = "The Eurasian tree sparrow is a passerine bird in the sparrow family with a rich chestnut crown and nape, and a black patch on each pure white cheek. The sexes are similarly plumaged, and young birds are a duller version of the adult.";

    }
}

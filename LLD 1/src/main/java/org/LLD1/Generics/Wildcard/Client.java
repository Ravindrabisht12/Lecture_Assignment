package org.LLD1.Generics.Wildcard;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        /**
         * Wildcard:
         * The wildcard (?) is used to represent an unknown type. Let's see an example.
         */
        List<Animal> animalsList = new ArrayList<>();
        animalsList.add(new Animal());


        // Dog list
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());


        // Lebrado list
        List<Lebrado> lebradoList = new ArrayList<>();
        lebradoList.add(new Lebrado());


        // Living Being list
        List<LivingBeing> lbList = new ArrayList<>();


        /**
         * Now if we print the lists
         * ✅ List<Animal> → allowed
         * ✅ List<Dog> → allowed
         * ✅ List<Lebrado> → allowed
         * ❌ List<LivingBeing> → not allowed (because LivingBeing is a superclass, not subclass, of Animal)
         *
         *
         * ? extends Animal
         * Means: list of Animal or any subclass of Animal.
         * You can read elements safely as Animal (because all are at least Animals).
         * You cannot add any specific subclass object except null (type safety issue).
         */
        PrintList(animalsList);
        PrintList(dogList);
        PrintList(lebradoList);
        // PrintList(lbList); // Error


        /**
         * Now print list with ? super wildcard extends
         * ? super Animal
         * Means: list of Animal or any superclass of Animal.
         * You can add Animal or its subclasses (safe because they fit in a list of Animal or above).
         * You cannot safely read elements as Animal — you can only treat them as Object without casting.
         */
        PrintListUsingSuper(animalsList);
        // PrintListUsingSuper(dogList);  // Error -> Child not accepted as we are using super
        // PrintListUsingSuper(lebradoList);  // Error
        PrintListUsingSuper(lbList);
    }

    public static void PrintList(List<? extends Animal> list){
        // list.add(new Animal()); ❌ compile error because if we pass Dog list dog is child of Animal and we are trying to add Parent object
        for(Animal a: list){
            System.out.println(a);
        }
    }

    public static void PrintListUsingSuper(List<? super Animal> list){
        // ✅ adding is safe
        list.add(new Animal());
        list.add(new Dog());
        // list.add(new LivingBeing()) // Error because trying to add main parent

        // ❌ cannot read directly as Animal
        for (Object obj : list) {  // must use Object --> Object type if called row type and another type is generic type
            System.out.println(obj);
        }
    }
}

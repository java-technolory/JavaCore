package com.company.main;

import com.company.model.Address;
import com.company.model.Employee;
import com.company.model.FamilyMember;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // JSON
        Employee emp1 = new Employee("Hai", 23, "haiphan97@gmail.com");
        String json1 = gson.toJson(emp1);
        System.out.println("Json: " + json1);

        String json2 = "{\"firstName\":\"Hai\",\"age\":23,\"mail\":\"haiphan97@gmail.com\"}";
        Employee emp2 = gson.fromJson(json2, Employee.class);
        System.out.println(emp2.toString());

        // Nested Objects
        Address address1 = new Address("Vietnam", "Hanoi");
        Employee emp3 = new Employee("Hai", 23, "haiphan97@gmail.com", address1);
        String json3 = gson.toJson(emp3);
        System.out.println(json3);

        String json4 = "{\"firstName\":\"Hai\",\"age\":23,\"mail\":\"haiphan97@gmail.com\",\"address\":{\"country\":\"Vietnam\",\"city\":\"Hanoi\"}}";
        Employee emp4 = gson.fromJson(json4, Employee.class);
        System.out.println(emp4.toString());

        /* Arrays and Lists */
        List<FamilyMember> family = new ArrayList<>();
        family.add(new FamilyMember("Wife", 23));
        family.add(new FamilyMember("Son", 2));

        //
        Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(":: <?> ::");
        Address address2 = new Address("Vietnam", "Hanoi");
        Employee emp5 = new Employee("Hai", 23, "haiphan97@gmail.com", address2, family);
        String json5 = gson2.toJson(emp5);
        System.out.println(json5);

        //
        String json6 = "{\"firstName\":\"Hai\",\"age\":23,\"mail\":\"haiphan97@gmail.com\",\"address\":{\"country\":\"Vietnam\",\"city\":\"Hanoi\"},\"family\":[{\"role\":\"Wife\",\"age\":23},{\"role\":\"Son\",\"age\":2}]}\n";
        Employee emp6 = gson.fromJson(json6, Employee.class);
        System.out.println(emp6.toString());

        //
        String json7 = gson.toJson(family);
        System.out.println(json7);

        //
        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String json8 = "[{\"role\":\"Wife\",\"age\":23},{\"role\":\"Son\",\"age\":2}]";
        FamilyMember[] familyMember = gson1.fromJson(json8, FamilyMember[].class);
        for (FamilyMember fm : familyMember) {
            System.out.println(fm.toString());
        }

        //
        System.out.println("=====> <=====");
        String json9 = "[{\"role\":\"Wife\",\"age\":23},{\"role\":\"Son\",\"age\":2}]";
        Type familyType = new TypeToken<ArrayList<FamilyMember>>() {
        }.getType();
        ArrayList<FamilyMember> familys = gson.fromJson(json9, familyType);
        Iterator<FamilyMember> itr = familys.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }

        //
        System.out.println("<?>");
        for (FamilyMember fm : familys){
            System.out.println(fm.toString());
        }

        //
        System.out.println("<?>");
        ListIterator<FamilyMember> li = familys.listIterator(familys.size());
        while (li.hasPrevious()){
            System.out.println(li.previous().toString());
        }
    }
}

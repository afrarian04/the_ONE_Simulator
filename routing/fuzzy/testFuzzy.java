/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package routing.fuzzy;

import java.util.Collections;
import java.util.LinkedList;
//import net.sourceforge.jFuzzyLogic.rule.FuzzyRuleSet;

/**
 * Test parsing an FCL file
 * @author pcingola@users.sourceforge.net
 */
public class testFuzzy {
    public static void main(String[] args) throws Exception {
        // Load from 'FCL' file
        LinkedList list1 = new LinkedList();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        System.out.println(list1);
        
        LinkedList list2 = new LinkedList();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        System.out.println(list2);
        
        boolean test = Collections.disjoint(list1, list2);
        
        if (!test) {
            System.out.println("Ada yang sama");
        } else {
            System.out.println("Berbeda");
        }
        
    }
}
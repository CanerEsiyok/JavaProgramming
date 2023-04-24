package utilities;

import java.util.Arrays;

public class ArraysUtility {
    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    // prints each double of a double array
    public static void printEachElement(double[] arr){
        for (double i : arr) {
            System.out.println(i);
        }
    }
    //print each char of a char array
    public static void printEachElement(char[] arr){
        for (char i : arr) {
            System.out.println(i);
        }
    }
    //print each String of a string array
    public static void printEachElement(String[] arr){
        for (String i : arr) {
            System.out.println(i);
        }
    }
    //returns the max number from an integer array
    public static int max(int[] list){
        Arrays.sort(list);
        return list[list.length-1];}
    // returns the max from a double array
    public static double max(double[] list){
        Arrays.sort(list);
        return list[list.length-1];}
    //returns the min number of an integer array
    public static int min(int[] list){
        Arrays.sort(list);
        return list[0];
    }
    public static double min(double[] list){
        Arrays.sort(list);
        return list[0];
    }
    //checks if the given integer array is contained in the given array, returns boolean
    public static boolean contains(int[] list,int n){
        boolean a=false;
        for (int i : list) {
            if(i==n){
                a= true;
                break;}
            else
                a= false;
        }
        return a;
    }
    //checks if the given double array is contained in the given array, returns boolean
    public static boolean contains(double[] list,double n){
        boolean a=false;
        for (double i : list) {
            if(i==n){
                a= true;
                }

        }
        return a;
    }
    //checks if the given char array is contained in the given array, returns boolean
    public static boolean contains(char[] list,char n){
        boolean a=false;
        for (char i : list) {
            if(i==n){
                a= true;
                break;}
            else
                a= false;
        }
        return a;
    }
    //checks if the given String array is contained in the given array, returns boolean
    public static boolean contains(String[] list,String n){
        boolean a=false;
        for (String i : list) {
            if(i.equalsIgnoreCase(n)){
                a= true;
                break;}
            else
                a= false;
        }
        return a;
    }
    //1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addElement(int[] array, int element){
        int[] result = new int[array.length + 1];

        int i =0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element){
        double[] result = new double[array.length + 1];

        int i =0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element){
        String[] result = new String[array.length + 1];

        int i =0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    //4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element){
        char[] result = new char[array.length + 1];

        int i =0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length-1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }
    // returns the frequency of an element
    public static int frequencyOfElement(int[] list,int n){
        int count=0;
        for (int i : list) {
            if(i==n)
                count++;
        }
        return count;
    }
    public static int frequencyOfElement(double[] list,double n){
        int count=0;
        for (double i : list) {
            if(i==n)
                count++;
        }
        return count;
    }
    public static int frequencyOfElement(char[] list,char n){
        int count=0;
        for (char i : list) {
            if(i==n)
                count++;
        }
        return count;
    }
    public static int frequencyOfElement(String[] list,String n){
        int count=0;
        for (String i : list) {
            if(i.equals(n))
                count++;
        }
        return count;
    }
    //returns a list of unique elements of an array
    public static int[] uniqueElements(int[] list){
        int[] result=new int[0];
        for (int i : list) {
            int count= ArraysUtility.frequencyOfElement(list,i);
            if(count==1)
                result= ArraysUtility.addElement(result,i);
        }
        return result;
    }
    public static double[] uniqueElements(double[] list){
        double[] result={};
        for (double i : list) {
            int count= ArraysUtility.frequencyOfElement(list,i);
            if(count==1)
                result= ArraysUtility.addElement(result,i);
        }
        return result;
    }
    public static char[] uniqueElements(char[] list){
        char[] result={};
        for (char i : list) {
            int count= ArraysUtility.frequencyOfElement(list,i);
            if(count==1)
                result= ArraysUtility.addElement(result,i);
        }
        return result;
    }
    public static String[] uniqueElements(String[] list){
        String[] result={};
        for (String i : list) {
            int count= ArraysUtility.frequencyOfElement(list,i);
            if(count==1)
                result= ArraysUtility.addElement(result,i);
        }
        return result;
    }
    //removes the element whose index is typed in
    public static int[] removeElements(int[] list,int index){
        int[] result=new int[list.length-1];
        for (int i = 0; i <index ; i++) {
            result[i]=list[i];
        }
        for (int i = index; i < list.length-1 ; i++) {
            result[i]=list[i+1];
        }
        return result;
    }
    public static double[] removeElements(double[] list,int index){
        double[] result=new double[list.length-1];
        for (int i = 0; i <index ; i++) {
            result[i]=list[i];
        }
        for (int i = index; i < list.length-1 ; i++) {
            result[i]=list[i+1];
        }
        return result;
    }
    public static char[] removeElements(char[] list,int index){
        char[] result=new char[list.length-1];
        for (int i = 0; i <index ; i++) {
            result[i]=list[i];
        }
        for (int i = index; i < list.length-1 ; i++) {
            result[i]=list[i+1];
        }
        return result;
    }
    public static String[] removeElements(String[] list,int index){
        String[] result=new String[list.length-1];
        for (int i = 0; i <index ; i++) {
            result[i]=list[i];
        }
        for (int i = index; i < list.length-1 ; i++) {
            result[i]=list[i+1];
        }
        return result;
    }
    //merges two arrays and returns a new array
    public static int[] merge(int[] a,int[] b){
        int[] merge=new int[a.length+b.length];
        int x=0;
        for (int i : a) {
            merge[x++]=i;
        }
        for (int i : b) {
            merge[x++]=i;
        }
        return merge;
    }
    public static double[] merge(double[] a,double[] b){
        double[] merge=new double[a.length+b.length];
        int x=0;
        for (double i : a) {
            merge[x++]=i;
        }
        for (double i : b) {
            merge[x++]=i;
        }
        return merge;
    }
    public static char[] merge(char[] a,char[] b){
        char[] merge=new char[a.length+b.length];
        int x=0;
        for (char i : a) {
            merge[x++]=i;
        }
        for (char i : b) {
            merge[x++]=i;
        }
        return merge;
    }
    public static String[] merge(String[] a,String[] b){
        String[] merge=new String[a.length+b.length];
        int x=0;
        for (String i : a) {
            merge[x++]=i;
        }
        for (String i : b) {
            merge[x++]=i;
        }
        return merge;
    }
    //reverses an array
    public static int[] reverse(int[] list){
        int[] result={};
        for (int i = list.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    public static double[] reverse(double[] list){
        double[] result={};
        for (int i = list.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    public static char[] reverse(char[] list){
        char[] result={};
        for (int i = list.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    public static String[] reverse(String[] list){
        String[] result={};
        for (int i = list.length - 1; i >= 0; i--) {
            result= ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    // replaces an index of an array
    public static int[] replace(int[] list,int index,int newElement){
        list[index]=newElement;
        return list;
    }
    public static double[] replace(double[] list,int index,double newElement){
        list[index]=newElement;
        return list;
    }
    public static char[] replace(char[] list,int index,char newElement){
        list[index]=newElement;
        return list;
    }
    public static String[] replace(String[] list,int index,String newElement){
        list[index]=newElement;
        return list;
    }
    // replaces multiple elements that have the same value
    public static int[] replaceAll(int[] list,int oldElement,int newElement) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == oldElement)
                list[i] = newElement;
        }
        return list;
    }
    public static double[] replaceAll(double[] list,int oldElement,double newElement) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == oldElement)
                list[i] = newElement;
        }
        return list;
    }
    public static char[] replaceAll(char[] list,int oldElement,char newElement) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == oldElement)
                list[i] = newElement;
        }
        return list;
    }
    public static String[] replaceAll(String[] list,int oldElement,String newElement) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(oldElement))
                list[i] = newElement;
        }
        return list;
    }
    // replaces the duplicated characters
    public static int[] removeDuplicates(int[] list){
        int[] result={};
        for (int i : list) {
            if(!ArraysUtility.contains(result,i))
                result=ArraysUtility.addElement(result,i);
        }
        return result;
    }
    public static double[] removeDuplicates(double[] list){
        double[] result={};
        for (double i : list) {
            if(!ArraysUtility.contains(result,i))
                result=ArraysUtility.addElement(result,i);
        }
        return result;
    }
    public static char[] removeDuplicates(char[] list){
        char[] result={};
        for (char i : list) {
            if(!ArraysUtility.contains(result,i))
                result=ArraysUtility.addElement(result,i);
        }
        return result;
    }
    public static String[] removeDuplicates(String[] list){
        String[] result={};
        for (String i : list) {
            if(!ArraysUtility.contains(result,i))
                result=ArraysUtility.addElement(result,i);
        }
        return result;
    }
    //inserts an element into the array
    public static int[] insert(int[] list,int index,int element){
        int[] result= {};
        for (int i = 0; i < list.length; i++) {
            if(i==index)
                result= ArraysUtility.addElement(result,element);
            result=ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    public static double[] insert(double[] list,int index,double element){
        double[] result= {};
        for (int i = 0; i < list.length; i++) {
            if(i==index)
                result= ArraysUtility.addElement(result,element);
            result=ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    public static char[] insert(char[] list,int index,char element){
        char[] result= {};
        for (int i = 0; i < list.length; i++) {
            if(i==index)
                result= ArraysUtility.addElement(result,element);
            result=ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    public static String[] insert(String[] list,int index,String element){
        String[] result= {};
        for (int i = 0; i < list.length; i++) {
            if(i==index)
                result= ArraysUtility.addElement(result,element);
            result=ArraysUtility.addElement(result,list[i]);
        }
        return result;
    }
    //swaps two elements in an array
    public static int[] swap(int[] list,int i,int j){
        int tem=list[i];
        list[i]=list[j];
        list[j]=tem;
        return list;
    }
    public static double[] swap(double[] list,int i,int j){
        double tem=list[i];
        list[i]=list[j];
        list[j]=tem;
        return list;
    }
    public static char[] swap(char[] list,int i,int j){
        char tem=list[i];
        list[i]=list[j];
        list[j]=tem;
        return list;
    }
    public static String[] swap(String[] list,int i,int j){
        String tem=list[i];
        list[i]=list[j];
        list[j]=tem;
        return list;
    }




}

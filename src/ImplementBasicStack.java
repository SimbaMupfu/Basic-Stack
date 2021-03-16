public class ImplementBasicStack {



    public static void main(String[] args){
        BasicStack<String> basicStack = new BasicStack<>();

        basicStack.push("Simba");
        String poppedData = basicStack.pop();
        System.out.println(poppedData);

//        //produce error when there are items to remove
//        basicStack.pop();
        basicStack.push("Clever");
        basicStack.push("Catherine");
        basicStack.push("Cliff");

        System.out.println(basicStack.access("Cliff"));
        System.out.println(basicStack.contains("Catherine"));
        System.out.println(basicStack.size());
    }
}

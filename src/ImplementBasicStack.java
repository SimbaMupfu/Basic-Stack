public class ImplementBasicStack {



    public static void main(String[] args){
        BasicStack<String> basicStack = new BasicStack<>();

        basicStack.push("Simba");
        String poppedData = basicStack.pop();
        System.out.println(poppedData);
    }
}

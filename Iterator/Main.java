package Iterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new List<String>();
        List.add("11-305");
        List.add("ИТИС");
        List.add("кфу");
        List.add("я пропустила все дедлайны:)");
        List.add("но я исправлюясь");

        Iterator<String> iterator = List.iterator();
        while(iterator.hasNext()) {
            String data = iterator.next();
            System.out.println(data);
        }

    }
}

public interface PrintService {
    default void print(Person[] people){
        System.out.println("Не положенно смотреть на такие отчёты");
    }

    void print(Customer[] customers);

    void print(Gamer[] gamers);
}

    import java.util.*;


    class book{
        String title;
        String author;
        int price;

        book(String t, String a, int p){
            title=t;
            author=a;
            price=p;
        }
    }

    class bookStore{
        private HashMap<String,book> books; //store bookname,object

        bookStore(){
            books=new HashMap<>();
        }

        void addBook(String t, String a, int p){
            books.put(t, new book(t, a, p));
            System.out.println("book added");

        }

        void removeBookByTitle(String t){
            book target=books.get(t);
            if(target==null){
                System.out.println("no book found");
                return;
            }

            books.remove(t);
            System.out.println(t+" has been removed");
            return;
        }

        void searchByAuthor(String auth){
            ArrayList<String> result=new ArrayList<>();

            //ele is key
            for(String ele:books.keySet()){
                book t=books.get(ele);
                if(t!=null){
                    if(t.author.equals(auth)){
                        result.add(t.title);
                    }

                }

            }

            System.out.println(result);

        }

        public void sortByPrice(){
            ArrayList<book> list=new ArrayList<>();

            for(String ele:books.keySet()){
                book val=books.get(ele);
                list.add(val);
            }

            Collections.sort(list,(a,b)-> a.price - b.price);
            System.out.println("asc order list is "+list);
            for(book b:list){
                System.out.println(b.title + b.price);
            }

            System.out.println();

            Collections.sort(list,(a,b)-> b.price - a.price);
            System.out.println("desc order list is "+list);
            for(book b:list){
                System.out.println(b.title + b.price);
            }

        
        }
    }

    public class BookFile{
        public static void main(String[] args) {
            // System.out.println("hey");
            bookStore store= new bookStore();

            store.addBook("harry potter", "kv", 125);
            store.addBook("harry potter 2", "kv", 100);
            store.addBook("self help", "mark", 250);

            store.removeBookByTitle("avengers");

            store.searchByAuthor("kv");

            store.sortByPrice();

            
        }
    }
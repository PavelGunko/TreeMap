import java.util.Collections;
import java.util.Comparator;

public class PersonComparator<PersonComparator> implements Comparator<Person> {
    Comparator<String> PersonComparator = new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            String[] getSurname1 = null;
            String[] getSurname2 = null;
            try {
                getSurname1 = o1.split(" ");
                getSurname2 = o2.split(" ");
            } catch (Exception e) {

            }
            if (getSurname1.length > getSurname2.length) {
                return -1;
            } else if (getSurname1.length == getSurname2.length) {
                return 1;
                // } else if (getSurname1 != null) {
                // return 0;
            } else {
                return 1;
                //Integer.compare(o2.getAge(), o1.getAge());
            }
        }

    };

}

   // @Override
 //   public int compare(Person o1, Person o2) {
  //      return Integer.compare(o2.getAge(), o1.getAge());
  //  }
//}
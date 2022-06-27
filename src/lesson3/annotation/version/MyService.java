package lesson3.annotation.version;

import java.util.Objects;

@Version(number = 3.3, name = "Hello")
public class MyService {

    private String field;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    private void thisClassInfo(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Objects.equals(field, myService.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }

    @Override
    public String toString() {
        return "MyService{" +
                "field='" + field + '\'' +
                '}';
    }
}

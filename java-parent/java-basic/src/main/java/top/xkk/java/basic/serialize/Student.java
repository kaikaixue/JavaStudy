package top.xkk.java.basic.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -4392658638228508589L;

    private String name;
    private Integer age;
    private Integer score;
    private transient String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPasswd() {
        return this.passwd;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();

        if (score > 0 || score > 0) {
            throw new IllegalArgumentException("学生分数只能在0~100之间");
        }
    }

    @Override
    public String toString() {
        return "Student:" + '\n' +
                "name = " + this.name + '\n' +
                "age = " + this.age + '\n' +
                "score = " + this.score + '\n' +
                "passwd = " + this.passwd + '\n'
                ;
    }
}

package day53_FunctionalInterface.tasks;

import java.util.List;

public interface ListFunction <T,R>{

    R apply(List<T> list);
}

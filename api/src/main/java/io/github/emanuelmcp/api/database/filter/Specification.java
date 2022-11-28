package io.github.emanuelmcp.api.database.filter;

public interface Specification<T> {
    boolean isExist(T t);
}

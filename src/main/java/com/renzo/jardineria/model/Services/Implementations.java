package com.renzo.jardineria.model.Services;

import java.util.List;

public interface Implementations<T> {
    public void create(T obj);
    public void delete(String id);
    public T getId(String id );
    public List<T> getAll();
}



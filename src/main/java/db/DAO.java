package db;

import java.util.List;

public interface DAO<T> {
    public List<T> selectAll();
    public int insert(T t);
    public int update(T t);
    public int delete(T t);
    public T selectById(T t);
}

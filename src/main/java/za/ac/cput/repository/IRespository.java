package za.ac.cput.repository;

public interface IRespository <T , ID> {
    T create(T t);
    T read(T id);
    T update(T id);
    boolean delete(ID id);
}

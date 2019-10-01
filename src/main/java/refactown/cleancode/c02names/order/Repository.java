package refactown.cleancode.c02names.order;

public interface Repository<T, ID> {
	public void insert(T entity);

	public void update(T entity);

	public T load(ID id);
}

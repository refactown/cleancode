package refactown.cleancode.c02names.order;

public class OrderService {
	
	private final OrderMapper mapper;
	private final OrderRepository repository;
	
	public OrderService(OrderMapper mapper, OrderRepository repository) {
		super();
		this.mapper = mapper;
		this.repository = repository;
	}
	
	public void place(OrderDTO orderDTO) {
		Order order = mapper.dtoToEntity(orderDTO);
		repository.insert(order);
	}

}

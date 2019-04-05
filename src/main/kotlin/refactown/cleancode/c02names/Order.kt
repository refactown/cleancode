package refactown.cleancode.c02names

import java.time.LocalDate

// PROBLEM: Order, Item - SOLUTION: Repository, Mapper, Service, DTO

data class OrderDTO (val number: String, val date: LocalDate, val items: List<Item>)
data class ItemDTO (val productId: String, val quantity: Int, val price: Double)

class Order (val number: String, val date: LocalDate) {
    private val items = mutableListOf<Item>()
    fun addItem(item: Item) = items.add(item)
    fun removeItem(item: Item) = items.remove(item)
    fun items() = listOf(items)
}
class Item (val productId: String, val quantity: Int, val price: Double)

interface Repository<T, ID>{
    fun insert(entity: T); fun update (entity: T); fun load(id:ID):T
}

interface OrderMapper{
    fun dtoToEntity(dto: OrderDTO): Order {TODO()}
    fun entityToDTO(entity: Order): OrderDTO {TODO()}
}

class OrderRepository : Repository<Order, String>{
    override fun insert(entity: Order) {  TODO("not implemented") }
    override fun update(entity: Order) { TODO("not implemented")  }
    override fun load(id: String): Order { TODO("not implemented") }
}

class OrderService(private val mapper: OrderMapper, private val repo: OrderRepository){
    fun place(orderDTO: OrderDTO){TODO()}
}



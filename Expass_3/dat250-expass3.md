## Experiment Assignment 3

### Technical problems i've encountered during installation and use of MongoDB and how to resolve them

During the installation i did not stumble upon any technical problems.
##### Validating package:
![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/validate.png)

#### Results obtained during Experiment 1
For experiment 1 i did not have any problems while following the tutorial and got following results:

##### Insert single and multiple
![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/instertsingle.png)
![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/insertmultiple.png)

##### Query
![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/query.png)

##### Update & Replace
![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/update%26replace.png)

##### Delete
![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/delete.png)

##### Bulk
![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/Bulk.png)

#### Experiment 2 example

For the operation we were gonna implement in exp2 i made a map-reduce operation to see how many total orders each customer got.
The map-reduce operation implemented is useful when you only want customer name and the total of orders for that customer.

```console
var mapFunction2 = function(){
    emit(this.cust_id, this._id)
}

var reduceFunction2 = function(kId, customerId){
    return customerId.length
}

db.order.mapReduce(
    mapFunction2,
    reduceFunction2,
    { out: "cmap" }
)

db.cmap.find()
```

![image](https://github.com/Oysteinvikane/DAT250/blob/main/Pictures/Expass3/exp2.png)



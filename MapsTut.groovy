class MapsTut{
    static void main (String[] args){
        def paulMap=[
            'name':'Paul',
            'age':35,
            'address':[
                'street':'123 Main St',
                'city':'Springfield'
            ],
            'hobbies':['golf','reading','coding']
        ];
        println("Name:"+paulMap['name']);
        println("Age:${paulMap.age}");
        println("City:${paulMap['address']['city']}");
        println("Street:$paulMap.address.street")
        println("Hobbies:${paulMap.hobbies[0]}");
        println("Hobbies:${paulMap['hobbies'].join(', ')}");

        paulMap.put('email','paul@gmail.com');
        println("Has address?"+paulMap.containsKey('address'));
        println("Has phone?"+paulMap.containsKey('phone'));
        println("Size of map:"+paulMap.size());
    }
}
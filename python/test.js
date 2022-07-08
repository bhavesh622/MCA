// const object1 =
// createObject({property:[name,rollno]},{values:['a',123]},{attributename:{writable: 'true'}, attributerollno:{configurable: 'false'}});

// function createObject(prop,val,attr){
//     }
// function createObject(...args){
//     o ={};
//     o.defineProperty(o,args[0].property)
// }

// /*
// const object1 = {
//     name : "a",
//     rollno : 123
    
// }
// object1.defineProperty(object1,'name', {writeable:true})

// */
const obj= 
    {a:'abc', b:'efg', c:'hij'};
    // {a:'abc', b:'efg', c:'hij'},
    // {a:'123', b:'456', c:'789'},
//   ];
  
  const search = 'a';
  
  const res = obj => Object.keys(obj).some(val => val.includes(search));
  
  console.log(res);
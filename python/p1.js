function checkProp(p,desc,t){

    const d =[];
    for(i in desc){
        // console.log(i);
            // console.log(i)
            if(p in desc[i]){
                d.push(desc[i][p]);
            }
            else{
                d.push(false);
            }
            return(d[t])
        }
    }
function createProp(desc){
    var attrk,attrv;
    var prop=[];
    var propfin = []

    for(i in desc){
            // console.log(i)
            attrk = Object.keys(desc[i])
            attrv = Object.values(desc[i])
            prop[i]="";
            for(j in attrk){
                // console.log(attrk[j],attrv[j])
                prop[i] += attrk[j]+":"+attrv[j]+",";//Creates string for all the attributes
                // console.log(prop[i])
            }
            propfin.push(prop[i]);   //pushes values from string index array to normal array for use in createObject()
        }
    // console.log(propfin);
    return propfin;
}
function createObject(...args){
    const o ={};
    const attrprop = checkProp('writable',args[2]);
    for(i in args[0].property){
        // console.log(i);
        // console.log(Object.values(args[2])[i]);//Takes all property names
        // console.log(attrk[i]);
        // attrv = Object.values(attr[i])
        //  if(args[0].property[i] in args[2]){
        // attrproperties = attrprop[i]
        // console.log(PropertyDescriptor(attrproperties))
        Object.defineProperty(o,args[0].property[i],{value: args[1].values[i],writable:checkProp('writable',args[2],i),configurable:checkProp('configurable',args[2],i)})
        //  }
        // Object.defineProperty(o,args[0].property[i],Object.values(args[2])[i])
        
    }
    // console.log(o.rollno);
    return o;
    
}
obj2 = createObject({property:['name','rollno']},{values:['a',123]},{attributename:{writable: 'true'}, attributerollno:{configurable: 'false'}});
console.log(obj2.name)
console.log(Object.getOwnPropertyDescriptor(obj2,'name'));
console.log(Object.getOwnPropertyDescriptor(obj2,'rollno'));
//a)
const obj1 = createObject({property:['name','rollno']},{values:['a',123]},{attributename:{writable: 'true'}, attributerollno:{configurable: 'false'}});
obj1.rollno=124;
//b
console.log(obj1.rollno) //rollno property = output 124. value should remain same as configurable property is false
//c
    //1)
        console.log(delete obj1);//outputs false since obj1 is const 
    //2)
        console.log(delete obj1.rollno)//outputs false since rollno is is a property of obj1 that is not configurable
//d
const object2 = createObject(
    {
        property: ["empid", "empname"]
    },
    {
        values: [1, 'Emp1']
    },
    {
        attributeid: {
            writable: 'false',
            configurable: 'true',
        },
        attributename: {
            configurable: 'true',
            writable: 'true'
        }
    }
);
//e

    // const object2 = createObject(
    //     { property: ["name", "rollno"] },
    //     { values: ["2", 'Emp 2'] },
    //     {
    //         attributeid: { writable: "false" },
    //         attributename: { configurable: "false" }
    //     });
//outputs syntaxerror as object2 is an already defined constant, if not in same block then it will assign new values however
//e
object2.rollno = 124;
console.log(object2.rollno)//no change in the final value as configurable is set to false for rollno
//f

function createObjectConfigurable(...args){
    const o ={};
    // const attrprop = checkProp('writable',args[2]);
    for(i in args[0].property){
        // console.log(i);
        // console.log(Object.values(args[2])[i]);//Takes all property names
        // console.log(attrk[i]);
        // attrv = Object.values(attr[i])
        //  if(args[0].property[i] in args[2]){
        // attrproperties = attrprop[i]
        // console.log(PropertyDescriptor(attrproperties))
        Object.defineProperty(o,args[0].property[i],{value: args[1].values[i],writable:checkProp('writable',args[2],0),configurable:true})
        //  }
        // Object.defineProperty(o,args[0].property[i],Object.values(args[2])[i])
        
    }
    // console.log(o.rollno);
    return o;
    
}

//g
function createMap(arg1, arg2){
    let result = null;

    if (typeof arg1 === "string"){
        result = new Map();
    }

    else{
        result = new WeakMap();
    }

    result.set(arg1, arg2);

    return result;
}

const student1 = {
    "name": "Adarsh",
    "email": "ad@ad.com"
}

const studentMap1 = createMap('student1', student1);
console.log(typeof studentMap1); // Map

const studentMap2 = createMap(student1, 'student1');
console.log(typeof studentMap1); // WeakMap (cause object is the key instead of string)

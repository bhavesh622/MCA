function createObject(...args){
    const o ={};
    const attrprop = checkProp('writable',args[2]);
    // a.push(...attrprop);
    // let a= attrprop.slice();
    // let a = []
    // console.log(Array.isArray(attrprop))
    // console.log(attrprop['attributename'])
    // for(const ob in attrprop){
    //     a.push(attrprop[ob]);
    //     console.log(a)
    //     console.log(attrprop[ob])
    // }
    // a = [...attrprop]
    // console.log(a)
    // arr[first...rest] = attrprop


    console.log(attrprop)
    // console.log(attrprop[])
    // var attr;
    // var attrk;
    // var attrv;
    // var ob;
    // var prop=[];
    // var prop1="";
    // for(i in args[2]){
    //     console.log(i)
    //     ob = Object.keys(args[2][i])
    //     obj = Object.values(args[2][i])
    //     prop[i]="";
    //     for(j in ob){
    //         console.log(ob[j],obj[j])
    //         prop[i] += ob[j]+":"+obj[j]+",";
    //         // prop[i]= prop1;
    //         console.log(prop[i])
    //     }
    //     // console.log(ob,obj)
    //     }
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
function checkProp(p,desc){
    var attrk,attrv;
    var prop=[];
    var propfin = []

    for(i in desc){
            // console.log(i)
            if(p in desc[i]){
                return(desc[i][p])
            }
            return(desc[i][p])

            // attrk = Object.keys(desc[i])
            // attrv = Object.values(desc[i])
            // for(j in attrk){
            //     console.log(attrk[j],attrv[j])
            //     prop[i] += attrk[j]+":"+attrv[j]+",";//Creates string for all the attributes
            //     // console.log(prop[i])
            // }
            propfin.push(prop[i]);   //pushes values from string index array to normal array for use in createObject()
        }
    // console.log(propfin);
    return propfin;
}
 obj2 = createObject({property:['name','rollno']},{values:['a',123]},{attributename:{writable: 'true',enumerable:'false'}, attributerollno:{configurable: 'false'}});
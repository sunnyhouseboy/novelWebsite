window.onload=function(){
let secondary=document.getElementsByClassName('secondary')[0];
    secondary.style.display="none";
let firstCarousel=document.getElementsByClassName('firstCarousel')[0];
let navDiv=document.getElementsByClassName("navDiv")[0];
// navDiv.style.left=(firstCarousel.offsetWidth/3-3*25)/2+"px";
let firstAllA=navDiv.getElementsByTagName('a');
let place=document.getElementsByClassName('place');
let newWork=document.getElementsByClassName('newWork')[0];
firstCarousel.style.left=0+"vw";
let winWidth=0;
if (window.innerWidth)

winWidth = window.innerWidth;

else if ((document.body) && (document.body.clientWidth))

winWidth = document.body.clientWidth;
let box=document.getElementsByClassName("box");
let original=document.getElementsByClassName('original')[0];
let ranking=document.getElementsByClassName('ranking')[0];
let vip=document.getElementsByClassName("vip")[0];
let up=document.getElementsByClassName("up")[0];
let down=document.getElementsByClassName('down')[0];
let leftSelling=document.getElementsByClassName('left');
let rightSelling=document.getElementsByClassName("right");
let flow=document.getElementsByClassName("flow");
let bestSelling=document.getElementsByClassName("bestSelling");
let thrustAuto=document.getElementsByClassName("thrustAuto")[0];
let bestBook=document.getElementsByClassName("bestBook");
place[0].onmouseover=function(){
  leftSelling[0].classList.add("leftOver");
  rightSelling[0].classList.add("rightOver");
  leftSelling[1].classList.remove("leftOver");
  rightSelling[1].classList.remove("rightOver");
}
bestSelling[0].onmouseover=function(){
  leftSelling[0].classList.remove("leftOver");
rightSelling[0].classList.remove("rightOver");
}
thrustAuto.onmouseover=function(){
  leftSelling[0].classList.remove("leftOver");
  rightSelling[0].classList.remove("rightOver");
  leftSelling[1].classList.add("leftOver");
  rightSelling[1].classList.add("rightOver");
}
bestSelling[1].onmouseover=function(){
  leftSelling[1].classList.remove("leftOver");
rightSelling[1].classList.remove("rightOver");
leftSelling[2].classList.remove("leftOver");
rightSelling[2].classList.remove("rightOver");
}
place[1].onmouseover=function(){
  leftSelling[2].classList.add("leftOver");
  rightSelling[2].classList.add("rightOver");
 
}
newWork.onmouseover=function(){
  leftSelling[2].classList.remove("leftOver");
  rightSelling[2].classList.remove("rightOver");
  leftSelling[3].classList.remove("leftOver");
  rightSelling[3].classList.remove("rightOver");
 
}
place[2].onmouseover=function(){
  leftSelling[3].classList.add("leftOver");
  rightSelling[3].classList.add("rightOver");
 
}
bestSelling[2].onmouseover=function(){
  leftSelling[4].classList.remove("leftOver");
  rightSelling[4].classList.remove("rightOver");
leftSelling[3].classList.remove("leftOver");
rightSelling[3].classList.remove("rightOver");
}
console.log("bestBook.length:"+bestBook.length)
console.log("leftSelling.length:"+leftSelling.length)
console.log("bestSelling.length:"+bestSelling.length)
console.log("flow.length:"+flow.length)
bestBook[3].onmouseover=function(){
  leftSelling[4].classList.add("leftOver");
  rightSelling[4].classList.add("rightOver");
}
box[1].onmouseover=function(){
  leftSelling[4].classList.remove("leftOver");
  rightSelling[4].classList.remove("rightOver");
}


down.style.display="none"
 original.onmouseover=function(){
    secondary.style.display="";
    
 }
 secondary.onmouseleave=function(){

 secondary.style.display="none";
 
}
vip.onmouseover=function(){
    secondary.style.display="none";
}
window.onscroll = function() {
    //为了保证兼容性，这里取两个值，哪个有值取哪一个
    //scrollTop就是触发滚轮事件时滚轮的高度
    var scrollTop = document.documentElement.scrollTop || document.body.scrollTop;
    
    if(scrollTop>0){
        up.classList.remove('up');
        up.className='upPlus'
        down.style.display="";
    }
    if(scrollTop==0){
        down.style.display="none"
        up.classList.remove('upPlus');
        up.className='up';
    }
   

  }
  let index=0;
  firstAllA[index].style.backgroundColor="#577ff7";


  for(let i=0;i<firstAllA.length;i++){
        firstAllA[i].onclick=function(){
            firstCarousel.style.left="-100vw"
        }
  }
  function getStyle(obj,name){
    return getComputedStyle(obj,null)[name];
  }
  let time; 
  
  function move(obj,attr,target,speed,unit,callback){
    clearInterval(obj.timer);
  let current=parseInt(getStyle(obj,attr));
  if(unit=="vw")
   current=parseInt(getStyle(obj,attr))/winWidth*100;
  if(current>target){
    speed=-speed;
    
  }
    obj.timer=setInterval(function(){
      let oldValue=parseInt(getStyle(obj,attr));
      if(unit=="vw")
        oldValue=parseInt(getStyle(obj,attr))/winWidth*100;
        let newValue=oldValue+speed;
        
        if(newValue<target&&speed<0||speed>0&&newValue>target){
            newValue=target;
        }
        obj.style[attr]=newValue+unit;
        if(newValue==target){
            clearInterval(obj.timer);
            
        }
        callback &&callback();
        
    },30)

  }
  
  for(let i=0;i<firstAllA.length;i++){
    firstAllA[i].onclick=function(){
        clearInterval(time);
        index=i;
        setA();
        firstAllA[i].style.backgroundColor="#577ff7"
        //  firstCarousel.style.left=-100*i+"vw";
        move(firstCarousel,"left",-100*i,5,"vw",function(){
            
          autoChange();
        },3000)
    }

    
  }
 
function  autoChange(){
  clearInterval(time)
    time=setInterval(function(){
         index++;
        
         if(index==firstAllA.length){
            index=0;
            firstCarousel.style.left=0;
         }
        
        move(firstCarousel,"left",-100*index,5,"vw",function(){
            
            setA(); 
            firstAllA[index].style.backgroundColor="#577ff7"
        
        });
    },3000)
}
autoChange();
function setA(){
    let i;
    for(i=0;i<firstAllA.length;i++){
        firstAllA[i].style.backgroundColor="";

    }   

}
let fiveA=document.getElementsByClassName("fiveA")[0];
fiveA.style.top=38+"px";

let aLine=fiveA.getElementsByTagName("a");
let indexA;
let timeA;
for(let i=0;i<aLine.length;i++){
 indexA=i
 aLine[i].style.visibility="hidden"
}
aLine[0].style.visibility="visible";
autoChangeA();
function autoChangeA(){
  clearInterval(timeA)
  timeA=setInterval(function(){
    indexA++;
    if(indexA==aLine.length){
      indexA=0;
      fiveA.style.top=38+"px";
      for(let i=0;i<aLine.length;i++){
        aLine[i].style.visibility="hidden"
       }
       aLine[0].style.visibility="visible";

    }
    move(fiveA,"top",38-29*indexA,5,"px",function(){
      for(let i=0;i<aLine.length;i++){
        aLine[i].style.visibility="hidden";
        aLine[indexA].style.visibility="visible";
      }
    });
  },3000)
}
let indexSelling=0;
let allIndexS=Math.ceil(14/5);
leftSelling[0].onclick=function(){
  indexSelling=indexSelling==0? allIndexS:indexSelling--;
  
  indexSelling--;
  indexSelling=indexSelling%allIndexS;
 if(indexSelling==allIndexS-1){
  flow[0].style.left=-1249*indexSelling+"px";
  return
 }
  move(flow[0],"left",-1249*indexSelling,50,"px",function(){

  });
}
rightSelling[0].onclick=function(){
  indexSelling=indexSelling==allIndexS ? 0: indexSelling++;
  indexSelling++
  indexSelling=indexSelling%allIndexS;
  if(indexSelling==0){
    
    flow[0].style.left=-1249*indexSelling+"px";
    return
  }
 
  move(flow[0],"left",-1249*indexSelling,50,"px",function(){

  });
  
}
let indexThrust=0;
let allIndexT=Math.ceil(11/4);
let manyThrust=document.getElementsByClassName("manyThrust")[0];
leftSelling[1].onclick=function(){
  indexThrust=indexThrust==0? allIndexT:indexThrust--;
   indexThrust--;
  indexThrust=indexThrust%allIndexT;
 if(indexThrust==allIndexT-1){
  manyThrust.style.left=-1169*indexThrust+"px";
  return
 }
  move(manyThrust,"left",-1169*indexThrust,50,"px",function(){

  });
}
rightSelling[1].onclick=function(){
  console.log(999)
  indexThrust=indexThrust==allIndexT ? 0: indexThrust++;
  indexThrust++
  indexThrust=indexThrust%allIndexT;
  if(indexThrust==0){
    
    manyThrust.style.left=-1169*indexThrust+"px";
    return
  }
 
  move(manyThrust,"left",-1169*indexThrust,50,"px",function(){

  });
  
}
let indexSellingF=0;
let allIndexF=Math.ceil(14/5);
leftSelling[2].onclick=function(){
  indexSellingF=indexSellingF==0? allIndexF:indexSellingF--;
  
  indexSellingF--;
  indexSellingF=indexSellingF%allIndexF;
 if(indexSellingF==allIndexF-1){
  flow[1].style.left=-1249*indexSellingF+"px";
  return
 }
  move(flow[1],"left",-1249*indexSellingF,50,"px",function(){

  });
}
rightSelling[2].onclick=function(){
  indexSellingF=indexSellingF==allIndexF ? 0: indexSellingF++;
  indexSellingF++
  indexSellingF=indexSellingF%allIndexF;
  if(indexSellingF==0){
    
    flow[1].style.left=-1249*indexSellingF+"px";
    return
  }
 
  move(flow[1],"left",-1249*indexSellingF,50,"px",function(){

  });
  
}
let indexSellingN=0;
let allIndexN=Math.ceil(14/5);
leftSelling[3].onclick=function(){
  indexSellingN=indexSellingN==0? allIndexN:indexSellingN--;
  
  indexSellingN--;
  indexSellingN=indexSellingN%allIndexN;
 if(indexSellingN==allIndexN-1){
  flow[2].style.left=-1249*indexSellingN+"px";
  return
 }
  move(flow[2],"left",-1249*indexSellingN,50,"px",function(){

  });
}
rightSelling[3].onclick=function(){
  indexSellingN=indexSellingN==allIndexN ? 0: indexSellingN++;
  indexSellingN++
  indexSellingN=indexSellingN%allIndexN;
  if(indexSellingN==0){
    
    flow[2].style.left=-1249*indexSellingN+"px";
    return
  }
 
  move(flow[2],"left",-1249*indexSellingN,50,"px",function(){

  });
  
}


let placeTen=document.getElementsByClassName("placeTen");
console.log("placeTen.length:"+placeTen.length)
let tenBtnIndex=0;
let labelButton=document.getElementsByClassName("labelButton")[0].getElementsByTagName("button");

for(let j=0;j<labelButton.length;j++){
  labelButton[j].style.backgroundColor=""
  labelButton[j].style.color="";
  placeTen[j].style.display="none";
}
labelButton[0].style.backgroundColor="#0964c2d1"
labelButton[0].style.color="#ffffff";
placeTen[0].style.display="";

for(let i=0;i<labelButton.length;i++){
  labelButton[i].onclick=function(){
    tenBtnIndex=i;
    for(let j=0;j<labelButton.length;j++){
      labelButton[j].style.backgroundColor=""
      labelButton[j].style.color="";
      placeTen[j].style.display="none";
    }
    labelButton[i].style.backgroundColor="#0964c2d1"
labelButton[i].style.color="#ffffff";
placeTen[i].style.display="";

  }
}
let indextens=0;
let allIndexTen=Math.ceil(14/5);
leftSelling[4].onclick=function(){
  indextens=indextens==0? allIndexTen:indextens--;
  
  indextens--;
  indextens=indextens%allIndexTen;
 if(indextens==allIndexTen-1){
  flow[3+tenBtnIndex].style.left=-1249*indextens+"px";
  return
 }
  move(flow[3+tenBtnIndex],"left",-1249*indextens,50,"px",function(){

  });
}
rightSelling[4].onclick=function(){
  indextens=indextens==allIndexTen? 0: indextens++;
  indextens++
  indextens=indextens%allIndexTen;
  if(indextens==0){
    
    flow[3+tenBtnIndex].style.left=-1249*indextens+"px";
    return
  }
 
  move(flow[3+tenBtnIndex],"left",-1249*indextens,50,"px",function(){

  });
  
}
let formao=document.getElementsByClassName("formao");
let format=document.getElementsByClassName("format");
let formas=document.getElementsByClassName("formas");
let formaf=document.getElementsByClassName("formaf");

let authorreo=document.getElementsByClassName("authorreo");
let authorret=document.getElementsByClassName("authorret");
let authorres=document.getElementsByClassName("authorres");
let authorref=document.getElementsByClassName("authorref");

let moreoverSo=document.getElementsByClassName("moreoverSo");
let moreoverSt=document.getElementsByClassName("moreoverSt");
let moreoverSs=document.getElementsByClassName("moreoverSs");
let moreoverSf=document.getElementsByClassName("moreoverSf");

let imgSmallo=document.getElementsByClassName("imgSmallo");
let imgSmallt=document.getElementsByClassName("imgSmallt");
let imgSmalls=document.getElementsByClassName("imgSmalls");
let imgSmallf=document.getElementsByClassName("imgSmallf");

let everyo=document.getElementsByClassName("everyo");
let everyt=document.getElementsByClassName("everyt");
let everyf=document.getElementsByClassName("everyf");
let everys=document.getElementsByClassName("everys");

// forma[0].style.display="none";
// authorre[1].style.display="none";
// moreoverS[1].style.display="none";
// imgSmall[1].style.display="none";
for(let k=0;k<everyo.length;k++){
  authorreo[k].style.display="none";
   moreoverSo[k].style.display="none";
   imgSmallo[k].style.display="none";
}
formao[0].style.display="none";
 authorreo[0].style.display="";
 moreoverSo[0].style.display="";
 imgSmallo[0].style.display="";
for(let k=0;k<everyo.length;k++){
  everyo[k].onmouseover=function(){
    for(let j=0;j<everyo.length;j++){
  authorreo[j].style.display="none";
   moreoverSo[j].style.display="none";
   imgSmallo[j].style.display="none";
   formao[j].style.display="";
}
formao[k].style.display="none";
 authorreo[k].style.display="";
 moreoverSo[k].style.display="";
 imgSmallo[k].style.display="";
  }
}

for(let k=0;k<everyt.length;k++){
  authorret[k].style.display="none";
   moreoverSt[k].style.display="none";
   imgSmallt[k].style.display="none";
}
format[0].style.display="none";
 authorret[0].style.display="";
 moreoverSt[0].style.display="";
 imgSmallt[0].style.display="";
for(let k=0;k<everyt.length;k++){
  everyt[k].onmouseover=function(){
    for(let j=0;j<everyt.length;j++){
  authorret[j].style.display="none";
   moreoverSt[j].style.display="none";
   imgSmallt[j].style.display="none";
   format[j].style.display="";
}
format[k].style.display="none";
 authorret[k].style.display="";
 moreoverSt[k].style.display="";
 imgSmallt[k].style.display="";
  }
}

for(let k=0;k<everys.length;k++){
  authorres[k].style.display="none";
   moreoverSs[k].style.display="none";
   imgSmalls[k].style.display="none";
}
formas[0].style.display="none";
 authorres[0].style.display="";
 moreoverSs[0].style.display="";
 imgSmalls[0].style.display="";
for(let k=0;k<everys.length;k++){
  everys[k].onmouseover=function(){
    for(let j=0;j<everys.length;j++){
  authorres[j].style.display="none";
   moreoverSs[j].style.display="none";
   imgSmalls[j].style.display="none";
   formas[j].style.display="";
}
formas[k].style.display="none";
 authorres[k].style.display="";
 moreoverSs[k].style.display="";
 imgSmalls[k].style.display="";
  }
}

for(let k=0;k<everyf.length;k++){
  authorref[k].style.display="none";
   moreoverSf[k].style.display="none";
   imgSmallf[k].style.display="none";
}
formaf[0].style.display="none";
 authorref[0].style.display="";
 moreoverSf[0].style.display="";
 imgSmallf[0].style.display="";
for(let k=0;k<everyf.length;k++){
  everyf[k].onmouseover=function(){
    for(let j=0;j<everyf.length;j++){
  authorref[j].style.display="none";
   moreoverSf[j].style.display="none";
   imgSmallf[j].style.display="none";
   formaf[j].style.display="";
}
formaf[k].style.display="none";
 authorref[k].style.display="";
 moreoverSf[k].style.display="";
 imgSmallf[k].style.display="";
  }
}
let circleindex=0;
let allCircle=Math.ceil(14/5);
let flowo=document.getElementsByClassName("flowo");
let circleChange=document.getElementsByClassName("circleChange");
circleChange[0].onclick=function(){
  circleindex++;
  circleindex=circleindex%allCircle;
     if(circleindex==allCircle){
      circleindex=0;
     } 
  flowo[0].style.left=-1249*circleindex+"px";
}
let circleindexm=0;
let allCirclem=Math.ceil(14/8);

circleChange[1].onclick=function(){
  circleindexm++;
  circleindexm=circleindexm%allCirclem;
     if(circleindexm==allCirclem){
      circleindexm=0;
     } 
  flowo[1].style.left=-1249*circleindexm+"px";
}
let circleindexv=0;
let allCirclev=Math.ceil(14/8);

circleChange[2].onclick=function(){
  circleindexv++;
  circleindexv=circleindexv%allCirclev;
     if(circleindexv==allCirclev){
      circleindexv=0;
     } 
  flowo[2].style.left=-1249*circleindexv+"px";
}
let call=document.getElementsByClassName("call")[0];
let blackBox=document.getElementsByClassName("blackBox")[0];
let question=document.getElementsByClassName("question")[0];
// question.style.display="none";
// blackBox.style.display="none";
// call.onclick=function(){
//   console.log(888);
//   question.style.display="";
//   blackBox.style.display="";
  
// }
// setTimeout(function() {.click(function(){
//   console.log(8888);
//   question.style.display="";
//   blackBox.style.display="";
// });}, 5000);
// let delay=call.onclick(){

// }
let secondaryC=document.getElementsByClassName("secondaryC")[0];
let classity=document.getElementsByClassName("classity")[0];
secondaryC.style.display="none";
classity.onclick=function(){
  secondaryC.style.display="";
}
secondaryC.onmouseleave=function(){
secondaryC.style.display="none";

}
let history=document.getElementsByClassName("history")[0];
let clear=document.getElementsByClassName("clear")[0];
clear.onclick=function(){
  history.style.display="none";
}
let search=document.getElementsByClassName("search")[0];
let secondarys=document.getElementsByClassName("secondarys")[0];
secondarys.style.display="none";
search.onclick=function(){
  secondarys.style.display="";
}
secondarys.onmouseleave=function(){
secondarys.style.display="none";
}

      

     
}





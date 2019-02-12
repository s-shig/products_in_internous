document.write("[問1]<br>");
function circleArea(radius,pi = 3.14 ){
  return radius * radius * pi;
}
document.write(circleArea(5)+"<br>");
document.write(circleArea(7)+"<br>");
document.write(circleArea(10)+"<br>");

document.write("[問2]<br>");
function sum(adult,child){
  return (500 * adult) + (200 * child);
}
// Aグループ
document.write(sum(2,4)+"円<br>");
// Bグループ
document.write(sum(1,5)+"円<br>");
// Cグループ
document.write(sum(3,7)+"円<br>");

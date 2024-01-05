package com.example.composeexample

import android.app.AlertDialog
import android.content.Context
import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeexample.ui.theme.ComposeExampleTheme

class MainActivity : ComponentActivity() {

    var mContext:Context = this@MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //SimpleText("mm")

           // Text(text = "Sonawale")

        }
    }

  // public val alertDialog = AlertDialog.Builder(mContext).setTitle("Alert")
}

@Composable
fun SayHello(name:String)
{
   Text(text ="GOOD$name")
}


//@Preview(showBackground = true, name = "Hello Message", widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFubction()

{
    //SayHello(name ="Prashant sonawale" )

   /* Text(
        text ="Prashant sdonawale",
         fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,
        color = Color.Red,
        fontSize = 36.sp,
        textAlign = TextAlign.Center
        )
*/

    //Image Composable
    /*Image(painter = painterResource(id = R.drawable.shap) ,
        contentDescription = "for Visualy infected persin to reade it", // this is the description usde for color blind persons
         colorFilter = ColorFilter.tint(Color.Blue), // to change the color of image
          contentScale = ContentScale.Crop
        )*/

    // Button Composable

 /*   Button(
        onClick = {  },
        colors = ButtonDefaults.buttonColors(
  containerColor = Color.White,


    ),
        enabled = false

    ) {// button with clcick and test,image
      Text(text = "Hello")
        Image(painter = painterResource(id = R.drawable.shapes) ,
            contentDescription = "Dummy")

    }
*/

    // Text Input Compose

/*TextField(     // taking input from user
    value = "Helle Prashant",
    onValueChange ={},      // if value changed  this method invokes
     label = { Text(text = "Enter Hire")}

    )*/


}
@Preview(showBackground = true, name = "Hello Message", widthDp = 300, heightDp = 500)
@Composable
private fun CircularImage()
{
    Image(painter = painterResource(id = R.drawable.shapes), contentDescription = "Discri5",
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(80.dp)
            .clip(CircleShape)
            .border(5.dp, color = Color.Yellow, CircleShape)




        )
}

@Composable
private fun PriviewWithModifire()// Modifire with its properties
{
   Text(
       text ="Hello",
       color = Color.White,
       modifier = Modifier
           .clickable { }
           .background(Color.Blue)
           .size(200.dp)
           .padding(36.dp)
           .border(4.dp, Color.Red)
           .clip(CircleShape)
           .background(Color.Yellow)




   )

}



@Composable
private fun PriviewFunctio()
{
Column {// not creates recycler item view
    ListViewItem(R.drawable.shapes,"John Deer","Manager")
    ListViewItem(R.drawable.shapes,"John Deer","Manager")
    ListViewItem(R.drawable.shapes,"John Deer","Manager")
    ListViewItem(R.drawable.shapes,"John Deer","Manager")

}
    // Single row on view
    //ListViewItem(R.drawable.shapes,"John Deer","Manager")
}



@Composable
private fun ListViewItem(imgId:Int,name:String,Ocupation:String)
//private fun ListViewItem(imgId:Int,name:String,Ocupation:String,modifier: Modifier)
{

    Row (Modifier.padding(10.dp)){
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "Disrib1",
         Modifier.size(40.dp)
            )
       // Image(painter = painterResource(id = R.drawable.shapes), contentDescription = "Disrib1")


      Column {
           Text(
               text =name,
               fontSize = 26.sp,
               fontWeight = FontWeight.Bold
           )
          Text(
              text = Ocupation,
              fontSize = 26.sp,
              fontWeight = FontWeight.Bold
              )
      }

    }
}


@Composable
private fun BoxTestFun()// its like a fram layout elemts are one above one
{
    Box (
      contentAlignment = Alignment.BottomEnd
    )
    {

        Image(painter = painterResource(id = R.drawable.shap), contentDescription = "Discrib1")
        Image(painter = painterResource(id = R.drawable.shapes), contentDescription = "Discrib2")
    }

}



@Composable
private  fun RowCompsFun()// Row Composable
{
    Row(

        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically

    )
    {
        Text(text ="A", fontSize = 26.sp)
        Text(text ="B", fontSize = 26.sp)
    }
}



@Composable
private fun PriViewFunction()  // Colum Comosable
{
    Column(

        verticalArrangement = Arrangement.Center, // dogancha madhe jevda space lavata yeil tevda lavne(maximum space between them)
                                           //.SpaceEvenly--> hole space divide between the two, same at top ,between them,bottom of them
                                             //.Center bot are set to vetical center
horizontalAlignment = Alignment.CenterHorizontally

    ) {// apperas item one below one, it mimiks linearlayou(Vertical arengement)

        Text(text ="A", fontSize = 24.sp)
        Text(text ="B", fontSize = 24.sp)
    }

}




@Composable
fun TextInput()
{
    val state = remember {   // Remember the previus state of compose
        mutableStateOf("")
    }
   TextField(
       value = state.value,
       onValueChange ={
        //   Log.d("TAG",it)
           state.value = it
       } ,
     label = { Text(text = "Enter Here")}
       )

}










/*@Preview(showBackground = true, name = "Hello Message2")
@Composable
fun SayHello2(name:String="Say Hello Moring")
{
    Text(text ="GOOD$name")
}*/


//@Preview
@Composable
fun SimpleTestPreview()
{
   // SimpleText("prashant sonawale")
    SimpleText2("kkkkkk")
}

@Composable
fun SimpleText(text:String)
{
    Text(text = text,

        modifier = Modifier
            .background(Color.Red)
            .padding(16.dp)
        )
}

@Composable
fun SimpleText2(text: String){

    BasicText(
        text = text,
        modifier = Modifier
            .background(Color.Blue)
            .padding(16.dp)


    )

}





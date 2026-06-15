package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.NotificationCompat
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            showTheme(modifier = Modifier)
            MyApplicationTheme {
                Surface(
                  modifier = Modifier.fillMaxSize(),
                  color = MaterialTheme.colorScheme.background
                        ) { }

                    }
                }
            }
        }

data class ImageItem(
    //слздаем класс для описания
    val id: Int,
    val title: String,
    val description: Int,
    //для картинок из drawble
    val ImageId: Int,
    val raiting: Double

)


@Composable
fun showTheme(modifier: Modifier)
{
    //настраиваем изображения в строку
    Row() {

        ImageItem(
            id = 1,
            title = "кировка - главное место челябинска",
            description = R.string.description1,
            ImageId = R.drawable.i__2_,
            raiting = 4.55
        )
        ImageItem(
            id = 2,
            title = "театр оперы и баллета",
            description = R.string.description2,
            ImageId = R.drawable.i__1_,
            raiting = 4.08
        )
        ImageItem(
            id = 2,
            title = "площадь революции",
            description = R.string.description3,
            ImageId = R.drawable.i__5_,
            raiting = 4.08
        )
        ImageItem(
            id = 2,
            title = "дом аквариум",
            description = R.string.description4,
            ImageId = R.drawable.i__4_,
            raiting = 4.08
        )
        ImageItem(
            id = 2,
            title = "театр оперы и баллета",
            description = R.string.description5,
            ImageId = R.drawable.i__3_,
            raiting = 4.08
        )
        ImageItem(
            id = 2,
            title = "театр оперы и баллета",
            description = R.string.description6,
            ImageId = R.drawable.i__1_,
            raiting = 4.08
        )
        //lazyColumn прокрцчиаваемый список
    }
        }
//    LazyColumn() {
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(16.dp)



//функция для отображения карточки
@Composable
fun  imageCard(item: ImageItem)
{
    //карта для картинки
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape =   RoundedCornerShape(16.dp),
        //Colors = CardDefaults.cardColors(
            //(containerColor = color.Grey)
        ) {
        Row(modifier = Modifier){
            Image(
                painter = painterResource(id = item.ImageId),
                contentDescription =  item.title,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            //spacer отступ между катинколй и текстом
            Spacer(modifier = Modifier.height(16.dp))
            //текст по центру
            //заголовок
            Text(
                text = item.title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                textAlign =  TextAlign.Center
            )
            //текст по центру
            //описание
//            Text(
//                text = item.description,
//                style = MaterialTheme.typography.titleMedium,
//                fontWeight = FontWeight.Bold,
//                textAlign =  TextAlign.Center
//            )

        }


    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        showTheme(modifier = Modifier)
    }
}
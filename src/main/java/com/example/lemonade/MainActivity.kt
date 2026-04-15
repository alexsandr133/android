package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.tooling.parseSourceInformation
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                showImage()

                }
            }
        }
    }


@Preview
@Composable
fun showImage() {
    //настраиваем отступы в приложении чтобы элементы занимали все место
    DiceWithButtonImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}

@Composable
fun DiceWithButtonImage(modifier: Modifier= Modifier){
  /*
  логика кода у нас будет следующей:
  пользователь жмет на картинку и она меняется
  с дерева до пустого стакана с текстом
  */
    //располоагаем элементы по центру в колонку
    var result by remember { mutableStateOf(1) }
    val imageResourse = when (result){
        1-> R.drawable.lemon_tree
        2-> R.drawable.lemon_squeeze
        3-> R.drawable.lemon_drink
        else-> R.drawable.lemon_restart
    }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       Image(
           painter = painterResource(imageResourse),
           contentDescription = result.toString()
       )
        Spacer(modifier = Modifier.height(16.dp))
       Button(onClick={result=(1..4).random()}){
            Text(stringResource(R.string.push))
       }
     }
    }

package edutech.nakabugo_irene.layoutscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edutech.nakabugo_irene.layoutscodelab.ui.theme.LayoutsCodeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsCodeLabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TopAppBar()
                }
            }
        }
    }
}
@Composable
fun TopAppBar(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text="Scaffolding tutorial", style=MaterialTheme.typography.h3)
                }, actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    }
                }
            )
        }
    ){
        innerPadding ->
        BodyContent(Modifier.padding(innerPadding))
    }

}

@Composable
fun BodyContent(modifier:Modifier=Modifier){
    Column(modifier=Modifier){
        Text(text="Nakabugo Irene is learning Jetpack Compose")
        Text(text="Its possible to be excellent at this!")
    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview(){
    LayoutsCodeLabTheme() {
        TopAppBar()

    }
}
/** IRENECARD
@Composable
fun IreneCard() {
    Row (
        modifier=Modifier.padding(8.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(MaterialTheme.colors.surface)
            .clickable(onClick={})
            .padding(20.dp)
            ){

        Surface(
            modifier = Modifier.size(50.dp),
            shape= CircleShape,
            color=MaterialTheme.colors.onSurface.copy(alpha=0.2f)
        ){
            //picture
        }
    Column(
        modifier=Modifier.padding(start=8.dp)
            .align(Alignment.CenterVertically)
    ) {
        Text("Nakabugo Irene", fontWeight = FontWeight.Bold)
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text("online", style = MaterialTheme.typography.body2)
        }
    }
}
}
*/

/**@Preview(showBackground = true)
@Composable
fun IreneCardPreview() {
    LayoutsCodeLabTheme {
       IreneCard()
    }
}
 */
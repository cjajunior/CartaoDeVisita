package br.com.alura.cartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alura.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitaTheme {
                // A surface container using the 'background' color from the theme
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {
    CardCompose(
        name = "Claudio Junior",
        title = "Android Developer Extraordinaire",
        phoneNumber = "+55(11)934720601",
        imagem = painterResource(R.drawable.android_logo),
        handle = "@AndroidDev",
        email = "claudiojunior@gmail.com",
        phoneIcon = painterResource(R.drawable.baseline_phone_24),
        emailIcon = painterResource(R.drawable.baseline_email_24),
        handleIcon = painterResource(R.drawable.baseline_polyline_24)
    )
}

@Composable
fun CardCompose(
    name: String,
    title: String,
    phoneNumber: String,
    imagem: Painter,
    handle: String,
    email: String,
    phoneIcon: Painter,
    emailIcon: Painter,
    handleIcon: Painter,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color(0xFF000B0F)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(painter = imagem, contentDescription = null, modifier = Modifier.size(110.dp))

        Text(
            text = name,
            fontSize = 35.sp,
            color = Color.White,
            modifier = Modifier.padding(8.dp)
        )

        Text(
            text = title,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            color = Color(0xFF3ddc84),
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(200.dp)) // Espaçamento entre as seções

        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.Start, // Alinha os elementos à esquerda
        ) {
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
                Spacer(modifier = Modifier.width(18.dp))
                Image(
                    phoneIcon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(18.dp))
                Text(
                    text = phoneNumber,
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
            Divider(
                color = Color.White,
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
                Spacer(modifier = Modifier.width(18.dp))
                Image(
                    handleIcon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = handle,
                    fontSize = 20.sp,
                    color = Color.White,
                )
            }
            Divider(
                color = Color.White,
                thickness = 1.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)) {
                Spacer(modifier = Modifier.width(18.dp))
                Image(
                    emailIcon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))

                Text(
                    text = email,
                    fontSize = 20.sp,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CartãoDeVisitaTheme {
        Greeting()
    }
}


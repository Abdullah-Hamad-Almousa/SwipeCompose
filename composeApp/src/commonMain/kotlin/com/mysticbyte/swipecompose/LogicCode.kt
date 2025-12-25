package com.mysticbyte.swipecompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import swipecompose.composeapp.generated.resources.Res
import swipecompose.composeapp.generated.resources.carrot
import swipecompose.composeapp.generated.resources.owl
import swipecompose.composeapp.generated.resources.sheep

data class Item(
    val id: String,
    val drawable: DrawableResource
)

@Composable
fun logicCode() {
    val listImages = listOf(
        Item("carrot", Res.drawable.carrot),
        Item("owl", Res.drawable.owl),
        Item("sheep", Res.drawable.sheep)
    )

    val pageState = rememberPagerState(
        pageCount = { listImages.size }
    )

    val scope = rememberCoroutineScope()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        HorizontalPager(
            pageState,
            pageSize = PageSize.Fill
        ) { index ->

            Image(
                painterResource(listImages[index].drawable),
                contentDescription = listImages[index].id,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

        }

        Box(
            modifier = Modifier
                .offset(0.dp,-10.dp)
                .fillMaxWidth(0.5f)
                .clip(RoundedCornerShape(100))
                .background(Color.Black.copy(alpha = 0.5f))
                .padding(6.dp)
                .align(Alignment.BottomCenter)
        ){

            IconButton(onClick = {

                scope.launch {

                    pageState.animateScrollToPage(
                        page = pageState.currentPage - 1
                    )

                }

            },
                modifier = Modifier.align(Alignment.CenterStart)
                ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "Go Back",
                    tint = Color.White
                )
            }

            Text(
                "Hello",
                modifier = Modifier
                    .align(Alignment.Center)
            )

            IconButton(onClick = {
                scope.launch {

                    pageState.animateScrollToPage(
                        page = pageState.currentPage + 1
                    )

                }
            },
                modifier = Modifier.align(Alignment.CenterEnd)
            ){
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Go Forward",
                    tint = Color.White
                )
            }

        }

    }

}

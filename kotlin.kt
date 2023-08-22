private fun makeSmallerBitmap(ımage : Bitmap,maximumSize : Int) : Bitmap {
        //Bitmapin Boyutunu Küçültük
        var width = ımage.width
        var height = ımage.height

        val bitmapRatio : Double = width.toDouble() / height.toDouble()

        if (bitmapRatio > 1) {
            width = maximumSize
            val scaledHeight = width / bitmapRatio
            height = scaledHeight.toInt()

        } else {
            height = maximumSize
            val scaledWidth = height * bitmapRatio
            width = scaledWidth.toInt()
        }

        return Bitmap.createScaledBitmap(ımage,width,height,true)

    }

maxsimum size 300 girin


val SmallerBitmap = makeSmallerBitmap(Bitmap!!,300) // üstteki function Kullanarak Bitmapi küçültürüz

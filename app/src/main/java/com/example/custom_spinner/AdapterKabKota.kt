package com.example.custom_spinner

import android.annotation.SuppressLint
import android.content.*
import android.view.*
import android.widget.*

class AdapterKabKota (
    applicationContext: Context,
    private val logo: IntArray,
    private val nama :Array<String>
    ): BaseAdapter() {
    val inflater = LayoutInflater.from(applicationContext)

    override fun getCount() = logo.size
    override fun getItem(position: Int) = null
    override fun getItemId(position: Int) = 0L

    @SuppressLint("ViewHolder", "InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val cv = inflater.inflate(R.layout.layout_item_spinner, null)
        val imgLogo = cv.findViewById<ImageView>(R.id.imgLogo)
        val tvNama = cv.findViewById<TextView>(R.id.tvNama)
        imgLogo.setImageResource(logo[position])
        tvNama.text = nama[position]
        return cv
    }
}
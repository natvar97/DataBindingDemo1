package com.indialone.databindingdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.indialone.databindingdemo1.databinding.ActivityMainBinding
import com.indialone.databindingdemo1.models.Product
import com.indialone.databindingdemo1.util.Products

class MainActivity : AppCompatActivity(), IMainActivity {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mProduct: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mProduct = Products().PRODUCTS[0]
        mBinding.product = mProduct
        mBinding.setQuantity(1)
        mBinding.iMainActivity = this
        mBinding.testUrl = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__480.jpg"
    }

    override fun inflateQuantityDialog() {
        val dialog = ChooseQuantityDialog()
        dialog.show(supportFragmentManager, getString(R.string.dialog_choose_quantity))
    }

    override fun setQuantity(quantity: Int) {
        mBinding.setQuantity(quantity)
    }
}
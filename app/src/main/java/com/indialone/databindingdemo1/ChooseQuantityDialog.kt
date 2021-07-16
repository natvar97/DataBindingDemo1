package com.indialone.databindingdemo1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.fragment.app.DialogFragment
import com.indialone.databindingdemo1.databinding.DialogChooseQuantityBinding


class ChooseQuantityDialog : DialogFragment() {

    private val TAG = "ChooseQuantityDialog"

    // data binding
    var mBinding: DialogChooseQuantityBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = DialogChooseQuantityBinding.inflate(inflater, container, false)
        mBinding!!.listView.setOnItemClickListener(mOnItemClickListener)
        mBinding!!.closeDialog.setOnClickListener(mCloseDialogListener)
        return mBinding!!.getRoot()
    }

    var mOnItemClickListener =
        OnItemClickListener { adapterView, view, i, l ->
            Log.d(TAG, "onItemSelected: selected: " + adapterView.getItemAtPosition(i))
            val iMainActivity = activity as IMainActivity
            iMainActivity.setQuantity(Integer.parseInt(adapterView.getItemAtPosition(i) as String))
            dialog!!.dismiss()
        }

    var mCloseDialogListener: View.OnClickListener = object : View.OnClickListener {
        override fun onClick(view: View?) {
            dialog!!.dismiss()
        }
    }

}
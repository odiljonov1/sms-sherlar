package com.example.sms_sherlar

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.sms_sherlar.Adapter.SherAdapter
import com.example.sms_sherlar.MainActivity.dialogShow.dialog
import com.example.sms_sherlar.Models.Sher
import com.example.sms_sherlar.Models.SherListObject
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.dialog_view.view.*
import kotlinx.android.synthetic.main.fragment_list.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_list, container, false)

        root.btn_back.setOnClickListener {
            root.findNavController().popBackStack()
        }

        val n = arguments?.getInt("key0")

        when(n){
            0 ->{
                root.txtsher_turi.text = "SEVGI \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.sevgiList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                    }

                })
            }
            1->{
                root.txtsher_turi.text = "SOG'INCH \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.soginchList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                    }

                })
            }
            2->{
                root.txtsher_turi.text = "TABRIK \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.tabrikList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

                    }

                })
            }
            3->{
                root.txtsher_turi.text = "OTA-ONA \nHAQIDA"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.sevgiList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    }

                })
            }
            4->{
                root.txtsher_turi.text = "DO'STLIK \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.dostlikList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

                    }

                })
            }
            5->{
                root.txtsher_turi.text = "HAZIL \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.hazilList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

                    }

                })
            }
            6->{
                root.txtsher_turi.text = "YANGI \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.yangilarList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

                    }

                })
            }
            7->{
                root.txtsher_turi.text = "SAQLANGAN \nSHE'RLARI"
                root.rv_list.adapter = SherAdapter(root.context, SherListObject.saqlanganList, object : SherAdapter.OnMyItemClickListener{
                    override fun onMyItemClck(sher: Sher, position: Int) {
                        dialogShow(sher)
                        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

                    }

                }, 1)
            }
        }

        return root
    }

    fun dialogShow(sher: Sher){
        val alerdDialog = BottomSheetDialog(root.context)
        val viewDialog = LayoutInflater.from(root.context).inflate(R.layout.dialog_view, null, false)

        viewDialog.txt_dialog_name.text = sher.name
        viewDialog.txt_dialog_text.text = sher.matni
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        alerdDialog.setContentView(viewDialog)
        alerdDialog.show()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
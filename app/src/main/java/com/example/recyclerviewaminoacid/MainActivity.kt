package com.example.recyclerviewaminoacid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewaminoacid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val aminoAcidModals = mutableListOf<AminoAcidModal>()
    private val aminoAcidImages = listOf(
        R.drawable.ic_alanine,
        R.drawable.ic_arginine,
        R.drawable.ic_asparagine,
        R.drawable.ic_aspartic_acid,
        R.drawable.ic_cysteine,
        R.drawable.ic_glutamic_acid,
        R.drawable.ic_glutamine,
        R.drawable.ic_glycine,
        R.drawable.ic_histidine,
        R.drawable.ic_isoleucine,
        R.drawable.ic_leucine,
        R.drawable.ic_lysine,
        R.drawable.ic_methionine,
        R.drawable.ic_phenylalanine,
        R.drawable.ic_proline,
        R.drawable.ic_serine,
        R.drawable.ic_threonine,
        R.drawable.ic_tryptophan,
        R.drawable.ic_tyrosine,
        R.drawable.ic_valine,
    )

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAminoActiveModals()

        binding.mRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.mRecyclerView.adapter = AminoAcidAdapter(aminoAcidModals)
    }

    private fun setupAminoActiveModals() {
        val aminoAcidNames = resources.getStringArray(R.array.amino_acids_full_txt)
        val aminoAcidAbbreviation = resources.getStringArray(R.array.amino_acids_three_letter_txt)
        val aminoAcidAbbreviationSmall =
            resources.getStringArray(R.array.amino_acids_one_letter_txt)

        for (i in 0..aminoAcidNames.lastIndex) {
            aminoAcidModals.add(
                AminoAcidModal(
                    aminoAcidNames[i],
                    aminoAcidAbbreviation[i],
                    aminoAcidAbbreviationSmall[i],
                    aminoAcidImages[i]
                )
            )
        }
    }
}
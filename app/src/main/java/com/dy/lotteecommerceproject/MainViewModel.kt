package com.dy.lotteecommerceproject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dy.lotteecommerceproject.model.SearchData
import com.dy.lotteecommerceproject.model.SearchInfo
import com.dy.lotteecommerceproject.repository.DataRepository
import com.dy.lotteecommerceproject.util.LogUtil
import com.dy.lotteecommerceproject.util.Results
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel @javax.inject.Inject constructor(
    private val dataRepository: DataRepository
) : ViewModel() {

    //항목 개수
    private val _movieInfo: MutableLiveData<List<SearchData>> = MutableLiveData()
    val movieInfo: LiveData<List<SearchData>>
        get() = _movieInfo

    val word = MutableLiveData<String>()

    fun onClickSearch(){
        viewModelScope.launch(Dispatchers.IO) {
            dataRepository.getMovieDetailInfo(word.value!!) {
                LogUtil.d("result = ${it.toString()}")
                if (it is Results.Success) {
                    _movieInfo.value = (it.data as SearchInfo).data
                }
            }

        }
    }


}
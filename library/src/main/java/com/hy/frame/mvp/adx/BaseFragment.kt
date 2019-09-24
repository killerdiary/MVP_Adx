package com.hy.frame.mvp.adx

import com.hy.frame.common.IBaseTemplateUI
import com.hy.frame.mvp.IBasePresenter
import com.hy.frame.mvp.IBasePresenterView
import com.hy.frame.mvp.IBaseView

/**
 * title 实现Presenter的BaseFragment
 * author heyan
 * time 19-8-22 下午3:48
 * desc 可以自己相同的方式实现
 */
abstract class BaseFragment<P : IBasePresenter> : com.hy.frame.ui.BaseFragment(), IBaseView, IBasePresenterView<P> {
    private var mPresenter: P? = null//如果当前页面逻辑简单, Presenter 可以为 null

    override fun getTemplateUI(): IBaseTemplateUI {
        return this
    }

    override fun getPresenter(): P? {
        if (isIDestroy()) return null
        if (this.mPresenter == null) this.mPresenter = buildPresenter()
        return this.mPresenter
    }

    override fun buildPresenter(): P? {
        return null
    }

    override fun onDestroy() {
        if (this.mPresenter != null) {
            this.mPresenter!!.destroy()
            this.mPresenter = null
        }
        super.onDestroy()
    }
}

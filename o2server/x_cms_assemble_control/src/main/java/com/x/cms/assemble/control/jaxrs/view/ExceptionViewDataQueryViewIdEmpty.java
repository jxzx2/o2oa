package com.x.cms.assemble.control.jaxrs.view;

import com.x.base.core.project.exception.PromptException;

class ExceptionViewDataQueryViewIdEmpty extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ExceptionViewDataQueryViewIdEmpty() {
		super("列表数据查询条件[categoryId]为空,无法进行数据查询。" );
	}
}

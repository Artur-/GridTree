package org.vaadin.gridtree.client;

import com.vaadin.client.renderers.ClickableRenderer;
import com.vaadin.client.widget.grid.RendererCellReference;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;

public class TreeNodeExpandButtonRenderer extends ClickableRenderer<CellWrapper, HTML> {

	@Override
	public HTML createWidget() {
	       final HTML html = GWT.create(HTML.class);
	       html.addClickHandler(this);
	       return html;
	}

	@Override
	public void render(RendererCellReference cell, CellWrapper cellValue, HTML widget) {
		final int INTEND_IN_PIXELS = 19;
    	final String value=cellValue.getValue();
    	if(cellValue.hasChildren()) {
    		if(!widget.getElement().getClassName().contains("v-tree-grid-node")) {
    			widget.getElement().addClassName("v-tree-grid-node");
    		}
    		if(cellValue.isExpanded()){
    			widget.getElement().removeClassName("collapsed");
    			widget.getElement().addClassName("expanded");
    		}
    		else {
    			widget.getElement().removeClassName("expanded");
    			widget.getElement().addClassName("collapsed");
    		}
    	} else {
    		widget.getElement().removeClassName("v-tree-grid-node");
    		widget.getElement().removeClassName("collapsed");
    		widget.getElement().removeClassName("expanded");
    	}

		final int intend=INTEND_IN_PIXELS*cellValue.getLevel();
		widget.setHTML(value);
		widget.getElement().getStyle().setProperty("paddingLeft", intend+"px");
	}

}

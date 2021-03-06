package org.vaadin.gridtree.client;

import com.vaadin.client.connectors.ClickableRendererConnector;
import com.vaadin.client.renderers.ClickableRenderer.RendererClickHandler;
import com.vaadin.shared.ui.Connect;

import com.google.web.bindery.event.shared.HandlerRegistration;

import elemental.json.JsonObject;

@Connect(org.vaadin.gridtree.treenoderenderer.TreeNodeExpandButtonRenderer.class)
public class TreeNodeExpandButtonRendererConnector extends
		ClickableRendererConnector<CellWrapper> {

    @Override
    public TreeNodeExpandButtonRenderer getRenderer() {
        return (TreeNodeExpandButtonRenderer) super.getRenderer();
    }
	@Override
	protected HandlerRegistration addClickHandler(
			RendererClickHandler<JsonObject> handler) {
		return getRenderer().addClickHandler(handler);
	}

}

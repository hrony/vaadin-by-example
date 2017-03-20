package de.oio.vaadin.uriactions;

import com.vaadin.server.VaadinService;
import de.oio.vaadin.event.EventBus;
import org.roklib.urifragmentrouting.UriActionMapperTree;

public class RoutingContextData {
  private EventBus eventBus;
  private UriActionMapperTree uriActionMapperTree;

  public RoutingContextData(EventBus eventBus, UriActionMapperTree uriActionMapperTree) {
    this.eventBus = eventBus;
    this.uriActionMapperTree = uriActionMapperTree;
  }

  public EventBus getEventBus() {
    return eventBus;
  }

  public UriActionMapperTree getUriActionMapperTree() {
    return uriActionMapperTree;
  }

  @Override
  public String toString() {
    return "RoutingContextData [RemoteAddr: " + VaadinService.getCurrentRequest().getRemoteAddr() + "]";
  }
}
package org.onebusaway.transit_data_federation.bundle.tasks.transfer_pattern;

import org.onebusaway.collections.tuple.Pair;
import org.onebusaway.transit_data_federation.services.transit_graph.StopEntry;

public class TransferNode extends TransferParent {

  private final Pair<StopEntry> stops;

  private boolean _exitAllowed;

  public TransferNode(Pair<StopEntry> stops) {
    this.stops = stops;
  }

  public Pair<StopEntry> getStops() {
    return stops;
  }

  public StopEntry getFromStop() {
    return stops.getFirst();
  }

  public StopEntry getToStop() {
    return stops.getSecond();
  }

  public void setExitAllowed(boolean exitAllowed) {
    _exitAllowed = exitAllowed;
  }

  public boolean isExitAllowed() {
    return _exitAllowed;
  }

  @Override
  public String toString() {
    StringBuilder b = new StringBuilder();
    toString(this, "", b);
    return b.toString();
  }
}
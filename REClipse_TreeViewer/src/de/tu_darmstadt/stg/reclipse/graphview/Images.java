package de.tu_darmstadt.stg.reclipse.graphview;

public enum Images {

  EXPORT_FILE("icons/export.png"), //$NON-NLS-1$
  ZOOM_IN("icons/zoom_in.png"), //$NON-NLS-1$
  ZOOM_OUT("icons/zoom_out.png"), //$NON-NLS-1$
  COLLAPSE("/icons/collapse.png"), //$NON-NLS-1$
  HIGHLIGHT("/icons/highlight.png"), //$NON-NLS-1$
  HEATMAP("/icons/heatmap.png"), //$NON-NLS-1$
  HEATMAP_GREY("/icons/heatmap_grey.png"); //$NON-NLS-1$

  private final String path;

  private Images(final String p) {
    path = p;
  }

  public final String getPath() {
    return path;
  }
}

# BatchGeometry
Tools for preparing Collada models to be converted into [.b3dm](https://github.com/AnalyticalGraphicsInc/3d-tiles/tree/master/TileFormats/Batched3DModel) for [3D Tiles](https://github.com/AnalyticalGraphicsInc/3d-tiles).


Ensures the uniqueness of images/textures/effects/materials for Collada models.
Will also create batched geometry that shares materials, generate a batchID vertex attribute array, and emit a JSON dictionary of batchtable entries to feed into [gltf2glb](https://github.com/Geopipe/gltf2glb)

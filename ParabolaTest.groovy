import eu.mihosoft.vrl.v3d.Parabola

return [ Parabola.extrudeByEquation(6,0.27,0,5)
	.move(20,0,0),
	Parabola.coneByEquation(8,1.27,0.9)
	.move(30,5,10),
	Parabola.coneByFocalLength(10, 10),
	Parabola.coneByHeight(10, 20)
		.move(50,0,0)
]
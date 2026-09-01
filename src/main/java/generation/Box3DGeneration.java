//package generation;
//
//import java.io.IOException;
//import java.nio.file.FileVisitResult;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.SimpleFileVisitor;
//import java.nio.file.attribute.BasicFileAttributes;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.lwjgl.llvm.ClangIndex;
//
//import volucris.bindings.generator.generation.Generator;
//import volucris.bindings.generator.parsing.HeaderFile;
//import volucris.bindings.generator.parsing.NativeFunctionPointer;
//
//public class Box3DGeneration {
//
//	public static void main(String[] args) throws IOException {
//		int options = ClangIndex.CXTranslationUnit_DetailedPreprocessingRecord;
//
//		HeaderFile headerFile = new HeaderFile(
//				"src/main/resources/nativeSources/box3d-0.1.0/include/box3d/box3d.h", options
//		);
//
//		Generator generator = new Generator("src/main/resources/configs/globalConfig.yaml", headerFile);
//
//		Map<String, NativeFunctionPointer> functionPointers = new HashMap<>();
//		headerFile.getRecord("b3DebugDraw").getFunctionPointerFields().forEach(f -> {
//			NativeFunctionPointer functionPointer = f.getFunctionPointer();
//			functionPointers.put(functionPointer.getName(), functionPointer);
//		});
//
//		generator.generateCallbacks("src/main/resources/configs/callbacksConfig.yaml", functionPointers);
//
//		generator.generateEnums("src/main/resources/configs/enumsConfig.yaml");
//
//		try {
//			Files.walkFileTree(Path.of("src/main/resources/configs/classConfigs"), new SimpleFileVisitor<Path>() {
//				@Override
//				public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//					String path = file.toString();
//
//					try {
//						if (path.endsWith(".yaml"))
//							generator.generate(file.toString());
//					} catch (Exception e) {
//						System.err.println(path);
//						e.printStackTrace();
//					}
//
//					return FileVisitResult.CONTINUE;
//				}
//			});
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//
//}

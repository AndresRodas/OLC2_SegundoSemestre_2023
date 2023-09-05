import React from 'react';
import { useState } from 'react';
import { InputTextarea } from 'primereact/inputtextarea';
import { Button } from 'primereact/button';
import { PostMethod } from '../api/http';

const visitorAPI = process.env.REACT_APP_API_URL_VISITOR;
const interpreterAPI = process.env.REACT_APP_API_URL_INTERPRETER;

const Home = () => {

    const [codeText, setCodeText] = useState('')
    const [consoleText, setConsoleText] = useState('')

    const CompileVisitor = async() => {
        const resp = await PostMethod(visitorAPI+'Visitor', { Content: codeText })
        await setConsoleText(resp?.Output)
    }

    const CompileInterpreter = async() => {
        const resp = await PostMethod(interpreterAPI+'Interpreter', { Content: codeText })
        await setConsoleText(resp?.Output)
    }

    return (
        <div>
            <div style={{display: 'flex'}}>
                <InputTextarea value={codeText} rows={15} cols={60} style={{marginBottom: '5%', marginRight: '2%'}} onChange={e => {setCodeText(e.target.value)}}/>
                <InputTextarea value={consoleText} rows={15} cols={60} style={{marginBottom: '5%', marginLeft: '2%'}} onChange={e => {setConsoleText(e.target.value)}}/>
            </div>
            <div style={{display: 'flex'}}>
                <Button label="RUN VISITOR" onClick={CompileVisitor} style={{marginRight: '2%'}} />
                <Button label="RUN INTERPRETER" onClick={CompileInterpreter} style={{marginLeft: '2%'}}/>
            </div>
        </div>
    );
};

export default Home;
